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

Fra morsekode:
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

Fra morsekode:
$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): fra
> Indsæt hvad du vil oversætte fra morse: ) ( ((( )
> test
```  
<hr>  

### Tutorial:
**Windows:**  
```
1) Download jar filen med linket under.
2) Åben kommandopromten.
3) Skriv "cd (hvor jar filen ligger)".
4) Skriv "java -jar MorseTranslator.jar"
```  

**Arch Linux:**  
```
1) Åben terminalen.
2) Skriv "sudo pacman -S git".
3) Skriv "git clone https://github.com/BastianAsmussen/Morse-Translator".
4) Skriv "cd Morse-Translator".
5) Skriv "java -jar MorseTranslator.jar".
```
<hr>  

<b>Klik <a href="https://github.com/BastianAsmussen/Morse-Translator/raw/main/MorseTranslator.jar" >her</a> for at downloade </b>`MorseTranslator.jar`<b>.</b>
