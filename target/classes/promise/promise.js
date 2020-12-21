new Promise(resolve => {
  resolve('a')
})
  .then(data => {
    return new Promise((resolve, reject) => {
      // resolve(data + 'b')
      reject(new Error('err'))
    })
  })
  .catch(err => {
    console.info(err)
  })
  .then(data => {
    console.log(data)
  })
  .catch(error => {
    console.error('error:' + error)
  })
