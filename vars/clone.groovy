def call(String url, String branch){
  echo "This is cloning the code"
  git url: "${url}", branch:"${branch}" 
  echo "Cloning of the code is successful"
}
