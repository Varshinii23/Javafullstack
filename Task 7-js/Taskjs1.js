let arr = [1, 2, 3];
let elementsToAdd = [4, 5];

for (let i = 0; i < elementsToAdd.length; i++) {
    arr[arr.length] = elementsToAdd[i];
}

console.log(arr);