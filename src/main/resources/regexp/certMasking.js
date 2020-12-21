const data = '350181199203202097'
// const data = 350181199203202097

// const result = data.replace(/(?<=(^\w{6}\w*))\w(?=(\w*\w{3}$))/g, '*')

// console.log(data)
// console.log(result)


function certMasking(value) {
  value = value.toString()
  let length = value.length || 0

  if (length <= 9) {
    return value
  } else {
    return value.slice(0, 6).padEnd(length - 3, '*') + value.slice(length - 3)
  }
}

console.log(certMasking(data))
