# Structural | Adapter

We use `Structural.Adapter` pattern when we need to translate a external resource into one of our own.
For example:
* When an outside component provides a functionality that we'd like to reuse, but it's incompatible with our 
current application. A suitable adapter can be developed to make them compatible with each other.
* When our application is not compatible with the interface that our client is expecting.
* When we want to reuse legacy code in our application without making any modification in the original code.

Some other samples like: `Translate from mPH to kmPH` or `Translate from feets to centimeters` are scenarios where we can use it.