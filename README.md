Aplikacja umożliwia sprawdzenie czy tekst wejściowy zawiera duże litery, małe litery, cyfry, znaki specjalne oraz ich kombinacje.

**Przykładowe użycie:**


**1.** Sprawdzenie czy tekst posiada **duże litery**

```
curl http://localhost:8080/upper/abCD
```


**2.** Sprawdzenie czy tekst posiada **małe litery**

```
curl http://localhost:8080/lower/abcd
```


**3.** Sprawdzenie czy tekst posiada **cyfry**

```
curl http://localhost:8080/digit/abcd123
```


**4.** Sprawdzenie czy tekst posiada **znaki specjalne**

```
curl http://localhost:8080/special/abc.d
```


**5.** Sprawdzenie czy tekst posiada **kombinacje** powyższych

```
curl http://localhost:8080/all/abcd123.
```
