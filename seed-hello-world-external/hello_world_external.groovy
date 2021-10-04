job('hello-world-external') {
  steps {
    batchFile('echo Hello, World External!')
  }
}
