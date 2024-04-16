# We haven't a class and we want using 
# @inject, @Component inside it.
# How to do that ?

# We have another annotation:
# 1- @Module : give us an ready instance  to login closed classes that we could make @inject inside them
# We create CoffeeModule to generate instance from the class we haven't access to it.

# 2- @Provides above any function want to use it.

# If we want to using inject dependencies from api or user:
