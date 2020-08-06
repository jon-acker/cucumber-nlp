package org.jacker.plugin;


import com.google.common.collect.ImmutableMap;

import java.util.Map;

import static java.util.Map.entry;

public class PennTreebankTags {
    static final Map<String, String> tags = Map.ofEntries(
            entry("CC", "Coordinating conjunction"),
            entry("CD", "Cardinal number"),
            entry("DT", "Determiner"),
            entry("EX", "Existential there"),
            entry("FW", "Foreign word"),
            entry("IN", "Preposition or subordinating conjunction"),
            entry("JJ", "Adjective"),
            entry("JJR", "Adjective, comparative"),
            entry("JJS", "Adjective, superlative"),
            entry("LS", "List item marker"),
            entry("MD", "Modal"),
            entry("NN", "Noun, singular or mass"),
            entry("NNS", "Noun, plural"),
            entry("NNP", "Proper noun, singular"),
            entry("NNPS", "Proper noun, plural"),
            entry("PDT", "Predeterminer"),
            entry("POS", "Possessive ending"),
            entry("PRP", "Personal pronoun"),
            entry("PRP$", "Possessive pronoun"),
            entry("RB", "Adverb"),
            entry("RBR", "Adverb, comparative"),
            entry("RBS", "Adverb, superlative"),
            entry("RP", "Particle"),
            entry("SYM", "Symbol"),
            entry("TO", "to"),
            entry("UH", "Interjection"),
            entry("VB", "Verb, base form"),
            entry("VBD", "Verb, past tense"),
            entry("VBG", "Verb, gerund or present participle"),
            entry("VBN", "Verb, past participle"),
            entry("VBP", "Verb, non-3rd person singular present"),
            entry("VBZ", "Verb, 3rd person singular present"),
            entry("WDT", "Wh-determiner"),
            entry("WP", "Wh-pronoun"),
            entry("WP$", "Possessive wh-pronoun"),
            entry("WRB", "Wh-adverb")
    );

}
