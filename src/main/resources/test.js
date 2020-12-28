// const a = new Promise((resolve, reject) => {
//   // reject('Error')
//   resolve('A')
// })
//   .then(data => {
//     console.log(1, data)
//     return 'B'
//   })
//   .then(data => {
//     console.log(2, data)
//     return new Promise((resolve, reject) => {
//       // reject('Error')
//       resolve('C')
//     })
//   })
//   .then(data => {
//     console.log(3, data)
//     return 'D'
//   })
//
//
// a.then(data => {
//   console.log(4, data)
// })
//   .catch(e => {
//     console.error(e)
//   })

// console.log(parseInt(123456.789))
// console.log(parseFloat(123456.789))
// console.log(123456.789.toLocaleString('en',{maximumFractionDigits: 2}))
// console.log(123456 .toLocaleString('en'))
// console.log(123456.789.toFixed(2))

// console.log([-1, 2, 3].find(i => i > 0))


// console.log(parseFloat("-.17%"))
// console.log(parseInt("-.18%"))
// console.log(parseInt(parseFloat("-.18%")))

const obj = {
  val: 'b',
}

function a(val) {
  val = 'a'
}

a(obj['val'])

console.log(obj)
