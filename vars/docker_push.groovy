def call(String Project, String ImageTag, String dockerhubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerhubUser')]) {
      sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
  }
  sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
}
