function balancePoint(arr){
    // sumLeft starts at index 0 of the input
    var sumLeft = arr[0];
    // sum right starts at index 1 and then goes to the end of the array
    // start with 0 and add values from the input with a for loop
    var sumRight = 0;
    // for loop to start at index 1 and end at the end of the array
    for (let i = 1; i < arr.length; i++) {
        sumRight += arr[i];
    };
    for (let j = 1; j < arr.length; j++) {
        // log values to console to check if it's working correctly
        console.log(`loop ${j} left is: ${sumLeft}`);
        console.log(`loop ${j} right is: ${sumRight}`);
        // if check to see if the left is equal to the right
        if (sumLeft == sumRight){
            // if it is, return the index of that point
            // loops start at 1, so index is j-1
            return j-1;
        }
        // if not, move that element from the right side to the left side
        sumLeft += arr[j];
        sumRight -= arr[j];
    }
    // if it never finds a balance point in the for loop, return -1
    return -1;
}
var arr1 = [3,4,7,2,-2,9,14]; // return false
var arr2 = [1, 2, 3, 4, 10] // return true
console.log(balancePoint(arr1));
console.log(balancePoint(arr2));
console.log(balancePoint([1, 1, 1, 1, 1, 5]));