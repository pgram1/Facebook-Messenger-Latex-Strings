# Facebook Messenger Latex Strings
A utility to convert a string to Facebook Messenger style Latex

Some regex make the code look messy :^) , sorry.

# Why

Facebook supports some form of markdown-like editing on messages. Among [the available editing options](https://www.facebook.com/help/147348452522644) facebook supports _LaTeX typesetting_ which makes characters look fancy like actual latex does when creating documents.

In order to use that (at the time of creating this utility), one has to go through a repetitive process of adding `\(` and `\)` at the beginning and the end of every word, else they are not spaced well when sent.

This utility manages to do that by splitting the string to words and then adding the appropriate symbols around them.

## Really, why?

Just for fun and to get around finger cramps from typing symbols, enjoy.

# How to run

As always

```
cd bin
java LatexConvert
```
