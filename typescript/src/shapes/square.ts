
// interface Square extends Shape{
//     sideLen: number,
// }

function newSquare(sideLen: number): Shape {
    return {
        computeArea: function (): number {
            return sideLen * sideLen
        }
    }
}



export { newSquare }