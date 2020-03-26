# Java Web Scraping
Simple Java WebScraping code examples.

Environment:
OS: Debian Buster
IDE: Eclipse Java Enterprise Edition 2019-12 (4.14.0)

------

## Maven

Packages used: 
Jsoup: 

``` html
<dependency>
  <!-- jsoup HTML parser library @ https://jsoup.org/ -->
  <groupId>org.jsoup</groupId>
  <artifactId>jsoup</artifactId>
  <version>1.13.1</version>
</dependency>
```

  unirest:

```html
<!-- https://mvnrepository.com/artifact/com.mashape.unirest/unirest-java -->
<dependency>
    <groupId>com.mashape.unirest</groupId>
    <artifactId>unirest-java</artifactId>
    <version>1.4.9</version>
</dependency>
```



## Headless Browser

1. Use HtmlUnit:

cons:
   - slow

   - easy to detect

     

2. Reverse engineer by calling the undocumented API directly
 
 pros:
  - use browser dev tools
  - very fast
  - returns structured data in XML or JSON

