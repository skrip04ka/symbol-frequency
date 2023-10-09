# Symbol-frequency
Calculation of the frequency of occurrence of characters in a given string.
The results are sorted in descending order.

# RUN
Clon repository from git
 ``` sh
git clone https://github.com/skrip04ka/symbol-frequency.git
 ```
Change directory
 ``` sh
cd symbol-frequency/
 ```
Run docker compose
 ``` sh
docker compose up
 ```

# USAGE
Send a GET request to http://localhost:8080/api/calc.
Request body contains the string.

The response will be json with the number of occurrences of characters sorted in descending order.


Send request with curl:

``` sh
curl -X GET http://localhost:8080/api/calc -d "{YOUR_STRING}"
```

# EXAMPLE
Init string
```
Hello world!
```
Result:
``` json
{
    "l": 3,
    "o": 2,
    " ": 1,
    "!": 1,
    "r": 1,
    "d": 1,
    "e": 1,
    "w": 1,
    "H": 1
}
```

