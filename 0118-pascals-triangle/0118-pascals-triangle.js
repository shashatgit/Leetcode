/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    if (numRows === 0) 
    {
        return [];
    }
    if (numRows === 1) 
    {
        return [[1]];
    }

    let prevRow = generate(numRows-1)
    let newRow = new Array(numRows).fill(1)

    for (let i = 1; i < numRows - 1; i++) {
        newRow[i] = prevRow[numRows - 2][i - 1] + prevRow[numRows - 2][i];
    }
    
    prevRow.push(newRow);
    return prevRow;
};


    
