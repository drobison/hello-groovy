try {
    int i = 1/1;
}
catch (Exception ex) {
    println "I am inside exception block";
    println ex.getCause();
    println ex.getMessage();
    ex.printStackTrace();
}
finally {
    println "inside finally block";
}
println "outside"

