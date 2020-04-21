class Fruits {

    private String fruitName
    private String fruitColor

    def setFruitName(String name) {
        fruitName = name
    }

    def setFruitColor(String color) {
        fruitColor = color;
    }

    def getFruitName() {
        println "Name of the fruit is $fruitName"
    }

    def getFruitColor() {
        println "Color of the fruit is $fruitColor"
    }    

    static void main(args) {
        Fruits apple = new Fruits()
        apple.setFruitColor("red")
        apple.setFruitName("apple")
        apple.getFruitColor()
        apple.getFruitName()
        println apple
    }
}