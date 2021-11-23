# Morsekode oversætter

### Indholdsfortegnelse:
┌─ [Information](#information)  
├─ [Eksempler](#eksempler)  
├─── [Eksempler med standard input](#eksempler-standard-input)  
├─── [Eksempler med brugerdefinerede input](#eksempler-brugerdefinerede-input)  
└─ [Tutorials](#tutorials)  

### Information:
Java version: 17  
Big O notation: O(1)  

Kommandoen kan tage 3 inputs: DOT, DASH og SPLIT. De tre inputs bliver brugt når programmet sender svaret tilbage på dens oversættelse.  
Man kan f.eks bruge `java -jar MorseTranslator.jar . - /` og så vil **DOT** blive sat til **.**, **DASH** sat til **-** og **SPLIT** vil blive sat til **/**.  
Hvis ingen inputs er specificeret vælger den automatisk `. - /` som inputs.  

<b>Klik <a href="https://github.com/BastianAsmussen/Morse-Translator/raw/main/out/artifacts/MorseTranslator_jar/MorseTranslator.jar" >her</a> for at downloade `MorseTranslator.jar`.</b>

<hr>  

### Eksempler:

#### Eksempler (standard input):  
```
Til morsekode:
$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): til
> Indsæt hvad du vil oversætte til morse: test test
> - . ... - / - . ... -

Fra morsekode:
$ java -jar MorseTranslator.jar
> Vil du oversætte fra eller til morse? (til/fra): fra
> Indsæt hvad du vil oversætte fra morse: - . ... - / - . ... -
> test test
```

#### Eksempler (brugerdefinerede input):  
```
Til morsekode:
$ java -jar MorseTranslator.jar ( ) /
> Vil du oversætte fra eller til morse? (til/fra): til
> Indsæt hvad du vil oversætte til morse: test
> ) ( ((( )

Fra morsekode:
$ java -jar MorseTranslator.jar ( ) /
> Vil du oversætte fra eller til morse? (til/fra): fra
> Indsæt hvad du vil oversætte fra morse: ) ( ((( )
> test
```  
<hr>  

### Tutorials:
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
