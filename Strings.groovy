/*
single quoted '...'
doubled quoted "..."
triple single quoted '''...'''
triple double quoted """..."""
slashly /.../
dollar slashy $/.../$
*/

def name = "John";
println "my name is " + name
println "my name is ".concat(name);
println "my name is $name"
println 'my name is $name' // can't do interperolation in single quotes

// or can use triple single quotes
def s1 = """This is a groovy string
with multiple lines"""
println s1

println name.length();
println name[2];
println name[-2];

println name[0..2]
println name[2..0]
println name[0,2,3]