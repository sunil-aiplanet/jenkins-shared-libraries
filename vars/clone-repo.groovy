def call(String repoName, String url, String branch){
  echo "Cloning the ${repoName} from ${url} (${branch})...!"
  git url:"${url}", branch:"${branch}"
  echo "Code cloning successful...!"
}
