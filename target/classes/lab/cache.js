class cache  {
  dataMap = new Map()
  countMap = new Map()
  maximum = 10

  constructor(maximum = 10) {
    this.maximum = maximum
  }

  get(key) {
    this.countMap.put(key, this.countMap.get(key) - 1)
    return this.dataMap.get(key) ?? -1
  }

  put(key, value) {
    while (this.dataMap.size >= this.maximum) {
      // TODO
    }

    this.dataMap.put(key, value)
    this.countMap.put(key, 0)
  }
}
