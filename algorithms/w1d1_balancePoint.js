var arr1 = [4, 5, 2, -8, 6]; // return false
var arr2 = [1, 2, 3, 4, 10] // return true

function balancePoint(arr){
    // sumLeft starts at index 0 of the input
    var sumLeft = arr[0];
    // sum right starts at the sum of values starting from the right and working back to index 1
    // start with 0 and add values from the input with a for loop
    var sumRight = 0;
    // for loop to start at the right side and work backwards to index 1
    for (let i = 1; i < arr.length; i++) {
        sumRight += arr[i];
    };
    for (let j = 1; j < arr.length; j++) {
        // log values to console to check if it's working correctly
        console.log(`loop ${j} left is: ${sumLeft}`);
        console.log(`loop ${j} right is: ${sumRight}`);
        // if check to see if the left is equal to the right
        if (sumLeft == sumRight){
            return true;
        }
        // if not, move that element from the right side to the left side
        sumLeft += arr[j];
        sumRight -= arr[j];
    }
    // if it never finds a balance point in the for loop, return false afterwards
    return false;
}

console.log(balancePoint(arr1));
console.log(balancePoint(arr2));
// console.log(balancePoint([1, 1, 1, 1, 1, 5]));