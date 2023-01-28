package Module3;

public class ParentClass {
	   def print_parent_class(self):
	        print("This is a parent class")

	class ChildClass(ParentClass):
	    def print_child_class(self):
	        print("This is a child class")

	parent_class_obj = ParentClass()
	child_class_obj = ChildClass()

	# Calling 1 - method of parent class by object of parent class
	parent_class_obj.print_parent_class()

	# Calling 2 - method of child class by object of child class
	child_class_obj.print_child_class()

	# Calling 3 - method of parent class by object of child class
	child_class_obj.print_parent_class()