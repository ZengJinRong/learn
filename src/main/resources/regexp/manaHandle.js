const data = '12WUBBRGG'

const result = data
  .replace(/(\d+)/g, '<p>$1</p>')
  .replace(/W/g,'<p>W</p>')
  .replace(/U/g,'<p>U</p>')
  .replace(/B/g,'<p>B</p>')
  .replace(/R/g,'<p>R</p>')
  .replace(/G/g,'<p>G</p>')

console.log(data)
console.log(result)
