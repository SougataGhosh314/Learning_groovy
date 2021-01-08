import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

public class FileHandling {
    static void main(String[] args) {
        new File("D:/Development/Integrating " +
                "cucumber with spring/Learning_Groovy" +
                "/src/text.txt").eachLine {
            line -> println "line : $line";
        }

        File file = new File("D:/Development/Integrating " +
                "cucumber with spring/Learning_Groovy" +
                "/src/text.txt")
        println file.text

        new File('D:/Development/Integrating cucumber with spring/Learning_Groovy/src/',
                'newText.txt').withWriter('utf-8') {
            writer -> writer.writeLine 'Hello World, Groovy is so groooooovy!!'
        }

        File file2 = new File("D:/Development/Integrating " +
                "cucumber with spring/Learning_Groovy" +
                "/src/newText.txt")
        println file2.text

        def map = [name:"Bruce", age: 42, city: "Gotham", hobby:"Discouraging criminals"]
        println(map["hobby"])
        //assertTrue(map.name.equals("Bruce"))

        new File('D:/Development/Integrating cucumber with spring/Learning_Groovy/src/',
                'records.txt').write(new JsonBuilder(map).toPrettyString())


        println(new JsonSlurper().parseText(new File('D:/Development/Integrating cucumber with spring/Learning_Groovy/src/',
                'records.txt').text))
    }
}
