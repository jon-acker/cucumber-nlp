package org.jacker.plugin;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Streams;
import cucumber.api.event.*;
import gherkin.AstBuilder;
import gherkin.Parser;
import gherkin.ast.GherkinDocument;
import gherkin.pickles.Compiler;
import gherkin.pickles.Pickle;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSTaggerME;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.google.common.collect.Streams.zip;

public class EventListener implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestSourceRead.class, testSourceReadHandler);

    }

    public EventListener(Appendable appendable) {
    }

    private EventHandler<TestSourceRead> testSourceReadHandler = new EventHandler<TestSourceRead>() {

        @Override
        public void receive(TestSourceRead event) {

            POSModel model = null;

            try (InputStream modelIn = new FileInputStream("src/main/resources/en-pos-maxent.bin")) {
                model = new POSModel(modelIn);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }

            POSTaggerME tagger = new POSTaggerME(model);

            String words[] = event.source.split("[\\n\\s]+");
            String tags[] = tagger.tag(words);

            Stream<ImmutableMap<String,String>> taggedWords = zip(Arrays.stream(words), Arrays.stream(tags), ImmutableMap::of);

            taggedWords.forEach(map -> map.forEach((w, t) -> System.out.println(w + ": " + PennTreebankTags.tags.get(t))));

        }
    };
}