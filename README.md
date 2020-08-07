Cucumber plugin for NLP analysis

Focus on Ubiquitous language etc.

Currenty, all the plugin does is, when you run scenarios - apart from running tests or printing out undefined steps - there's a output of the POS analysis.
This could be used to consolidate the language used in the scenarios making them more consistent, being able to suggest name of Objets or Types to use in the code or even generate classes and method based on nouns, verbs, adverbs etc.

Example output:
Lending: Verb, gerund or present participle
a: Determiner
book: Noun, singular or mass
Background:: Adverb
Given: Verb, past participle
Jon: Proper noun, singular
is: Verb, 3rd person singular present
a: Determiner
member: Noun, singular or mass
of: Preposition or subordinating conjunction
the: Determiner
library: Noun, singular or mass
Scenario:: Noun, singular or mass
Borrower: Proper noun, singular
is: Verb, 3rd person singular present
lent: Verb, past participle
a: Determiner
book: Noun, singular or mass
that's: Preposition or subordinating conjunction
in: Preposition or subordinating conjunction
stock: Noun, singular or mass
Given: Verb, past participle
there: Existential there
is: Verb, 3rd person singular present
1: Cardinal number
copy: Noun, singular or mass
of: Preposition or subordinating conjunction
"Harry: Proper noun, singular
Potter": Proper noun, singular
in: Preposition or subordinating conjunction
stock: Noun, singular or mass
When: Wh-adverb
Jon: Proper noun, singular
borrows: Verb, 3rd person singular present
the: Determiner
book: Noun, singular or mass
"Harry: Proper noun, singular
Potter": Proper noun, singular
from: Preposition or subordinating conjunction
the: Determiner
library: Noun, singular or mass
Then: Adverb
stock: Noun, singular or mass
count: Noun, singular or mass
for: Preposition or subordinating conjunction
"Harry: Proper noun, singular
Potter": Proper noun, singular
should: Modal
be: Verb, base form
0: Cardinal number
And: Coordinating conjunction
the: Determiner
book: Noun, singular or mass
"Harry: Proper noun, singular
Potter": Proper noun, singular
should: Modal
be: Verb, base form
loaned: Verb, past participle
to: to
Jon: Proper noun, singular
Scenario:: Proper noun, singular
Returning: Verb, gerund or present participle
a: Determiner
book: Noun, singular or mass
late: Adverb
-: null
incurring: Verb, gerund or present participle
a: Determiner
fine: Adjective
(after: Proper noun, singular
cuttoff): Noun, singular or mass
Given: Verb, past participle
Jon: Proper noun, singular
borrowed: Verb, past tense
the: Determiner
book: Noun, singular or mass
"Harry: Proper noun, singular
Potter": Proper noun, singular
on: Preposition or subordinating conjunction
17th: Adjective
of: Preposition or subordinating conjunction
March: Proper noun, singular
When: Wh-adverb
Jon: Proper noun, singular
returns: Verb, 3rd person singular present
the: Determiner
book: Noun, singular or mass
"Harry: Proper noun, singular
Potter": Proper noun, singular
on: Preposition or subordinating conjunction
the: Determiner
21st: Adjective
of: Preposition or subordinating conjunction
March: Proper noun, singular
at: Preposition or subordinating conjunction
00:00: Cardinal number
Then: Adverb
Jon: Proper noun, singular
should: Modal
be: Verb, base form
charged: Verb, past participle
a: Determiner
£5: Cardinal number
fine: Noun, singular or mass
