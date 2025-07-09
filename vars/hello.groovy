def call(){
  echo "hello i am shared library from githun in jenkins"
  sh "whoami"
  sh "ifconfig"
}
