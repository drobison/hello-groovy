File myfile = new File("data4.txt")

myfile.write("This is line 1");
myfile << "\nThis is Line 2"
//myfile.text = "This is Line 3" //overwrites file contents

// overwrites
myfile.withWriter { writer ->
    writer.writeLine("This is line 4")
}

myfile.append("\nThis is Line 5")

println myfile.text