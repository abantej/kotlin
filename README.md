# kotlin notes

### In which situation val/var is necessary in Kotlin constructor parameter?

When you write val/var within the constructor, it declares a property inside the class. When you do not write it, it is simply a parameter passed to the primary constructor, where you can access the parameters within the init block or use it to initialize other properties.