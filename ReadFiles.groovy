//reading files
String filePath = "data1.txt"
File myFile = new File(filePath)

// reading entire content as String
println  myFile.text

// collect lines into a list
def list = myFile.collect { it }
println "list : $list"

// store file content in an array
def array = myFile as String[]
println "array : $array"

// read file into a list of String
def lines = myFile.readLines()
println "lines : $lines"

// read file line by line
myFile.eachLine { line, lineNum ->
    println "$lineNum : $line"
}

// read with reader
def line
myFile.withReader { reader ->
    while(line = reader.readLine() != null) {
        println line
    }
}

// reading with new reader
def outputFile = "data2.txt"
def reader = myFile.newReader()
new File(outputFile).append(reader)
reader.close()

// when working with binary files, read content as bytes
byte[] contents = myFile.bytes
println contents

// size in bytes
println myFile.length()

// check if is a file or directory
println myFile.isFile()
println myFile.isDirectory()

// get list of files from a directory
new File(".\\").eachFile {
    files -> println files.getAbsolutePath()
}

//recursively display all files in a dir & it's sub-dir
new File (".\\").eachFileRecurse {
    file -> println file.getAbsolutePath()
}

// copy file data to another file
def newFile = new File("data3.txt")
newFile << myFile.text

// delete file
newFile.delete()
