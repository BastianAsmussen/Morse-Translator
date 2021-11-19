# Morsekode oversætter

### Information:
Kommandoen kan tage 2 inputs: DOT og DASH. De to inputs bliver brugt når programmet sender svaret tilbage på dens oversættelse.  
Man kan f.eks bruge `java -jar MorseTranslator.jar . -` og så vil **DOT** blive sat til **.** og **DASH** sat til **-**.  
Hvis ingen inputs er specificeret vælger den automatisk `. -` som inputs.  

<hr>  

**Eksempler (standard inputs):**  
```
Til morsekode:
$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): til
> Indsæt hvad du vil oversætte til morse: test
> - . ... -

$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): fra
> Indsæt hvad du vil oversætte fra morse: - . ... -
> test
```

**Eksempler (brugerdefinerede inputs):**  
```
Til morsekode:
$ java -jar MorseTranslator.jar ( )
> Vil du oversætte fra eller til morse? (til/fra): til
> Indsæt hvad du vil oversætte til morse: test
> ) ( ((( )

$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): fra
> Indsæt hvad du vil oversætte fra morse: ) ( ((( )
> test
```  
<hr>

Klik <a href="https://github.com/BastianAsmussen/Morse-Translator/raw/main/MorseTranslator.jar" >her</a> for at downloade `Morse Translator.jar`.
