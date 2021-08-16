
class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor(){
        this.root = null;
    }
    
    add(valueInput){
        let newNode = new Node(valueInput);

        // if empty, set as root
        if (this.root == null){
            this.root = newNode;
        }
        else {
            // if it's not empty, set root as the runner and start a recursive check
            var runner = this.root;
            this.recursiveCheck(newNode, runner);
        }
    }
        
    recursiveCheck(newNode, runner){
        // if input < runner and left is empty, add to left
        if (newNode.value < runner.value){
            if (runner.left == null){
                runner.left = newNode;
            }
            else{
                // if input < runner and left is NOT empty, set runner to left and call the check again
                runner = runner.left;
                this.recursiveCheck(newNode, runner);
            }
        }
        // if input > runner and right is empty, add to right
        else if (newNode.value > runner.value){
            if (runner.right == null){
                runner.right = newNode;
            }
            else{
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

    printTree(node){
        console.log("Current node = ", node.value);
        if(node.left!=null){
            console.log("left node of", node.value, "= " + node.left.value)
            this.printTree(node.left)
        }
        if(node.right != null){
            console.log("Right node of", node.value, " = " + node.right.value)
            this.printTree(node.right);
        }
    }
}

var test = new BST();
test.add(20).add(30).add(10).add(15).add(25).add(31).add(8).add(15).add(12).add(13).printTree(test.root);