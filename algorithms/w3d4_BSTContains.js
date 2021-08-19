class Node {
    constructor(valueInput) {
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        this.root = null;
    }

    add(valueInput) {
        let newNode = new Node(valueInput);

        // if empty, set as root
        if (this.root == null) {
            this.root = newNode;
        }
        else {
            // if it's not empty, set root as the runner and start a recursive check
            var runner = this.root;
            this.recursiveCheck(newNode, runner);
        }
    }

    recursiveCheck(newNode, runner) {
        // if input < runner and left is empty, add to left
        if (newNode.value < runner.value) {
            if (runner.left == null) {
                runner.left = newNode;
            }
            else {
                // if input < runner and left is NOT empty, set runner to left and call the check again
                runner = runner.left;
                this.recursiveCheck(newNode, runner);
            }
        }
        // if input > runner and right is empty, add to right
        else if (newNode.value > runner.value) {
            if (runner.right == null) {
                runner.right = newNode;
            }
            else {
                // if input > runner and right is NOT empty, set runner to right and call the check again
                runner = runner.right;
                this.recursiveCheck(newNode, runner);
            }
        }
        else {
            // if the value is not < or >, it must be a duplicate
            return "You cannot enter a duplicate value.";
        }

    }

    printTree(node) {
        console.log("Current node = ", node.value);
        if (node.left != null) {
            console.log("left node of", node.value, "= " + node.left.value)
            this.printTree(node.left)
        }
        if (node.right != null) {
            console.log("Right node of", node.value, " = " + node.right.value)
            this.printTree(node.right);
        }
    }

    findMax(runner = this.root) {
        // if there is no runner established, start at the root
        console.log("looking at " + runner.value)
        // if there is a runner, check if it has a right value
        if (runner.right != null) {
            // if not, set the runner to the node to the right and call the function again
            runner = runner.right;
            console.log("moving to " + runner.value)
            this.findMax(runner);
        }
        // if there is no node to the right, we are at the max
        else {
            console.log("ending at " + runner.value)
            return runner.value;
        }
    }

    findMin(runner = this.root) {
        // if there is no runner established, start at the root
        console.log("looking at " + runner.value)
        // if there is a runner, check if it has a left value
        if (runner.left != null) {
            // if not, set the runner to the node to the left and call the function again
            runner = runner.left;
            console.log("moving to " + runner.value)
            this.findMin(runner);
        }
        // if there is no node to the left, we are at the min
        else {
            console.log("ending at " + runner.value)
            return runner.value;
        }
    }

    size(runner = this.root) {
        // If there is no node when the runner moves (or starts), add 0
        if (!runner) {
            return 0;
        }
        else {
            return (this.size(runner.left) + this.size(runner.right) + 1)
        }
    }

    contains(target, runner = this.root) {
        if (!runner){
            return false;
        }
        if (runner.value == target){
            return true;
        }
        if (target > runner.value) {
            return this.contains(target, runner = runner.right);
        }
        if (target < runner.value) {
            return this.contains(target, runner = runner.left);
        }
    }
}

var test1 = new BST();
test1.add(20);
test1.add(30);
test1.add(40);
test1.add(10);
test1.add(25);
test1.add(42);
test1.add(19);
console.log(test1.contains(42));