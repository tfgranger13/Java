class TrieNode{
    constructor(letter){
        this.letter = letter;
        this.children = {};
        this.isWord = false;
    }
}


class TrieSet{
    constructor(){
        this.root = new TrieNode("");
    }

    add(str){
        let runner = this.root;
    }

    print(){

    }

}


var set1 = new TrieSet();

set1.add("ape");
set1.add("apple");
set1.add("dog");
set1.add("are");

// letterp = new TrieNode("p");
// letterp.children("e") = new TrieNode("e");

