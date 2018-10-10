# Triangle
The triangle challenge of Tradeshift.

# Challenge description
Write a program that will determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

# How to test
Use the following command to run test:

    # mvn test

# How to build
Use the following command to build the lib:

    # mvn package

Running this command will create a jar file which can be included in your project.

# How to use
You can create a triangle by passing the sides lengths like below:

    Triangle triangle = TriangleFactory.createTriangle(sideA, sideB, sideC);

If the sides lengths is not positive or could not form a triangle an **IllegalArgumentException** will be thrown.
You can get type of each _Triangle_ by using **getType** method like below:

    TriangleType type = triangle.getType();

# Extra Information
Extra information can be found [here](https://github.com/majidkabir/Triangle/wiki)