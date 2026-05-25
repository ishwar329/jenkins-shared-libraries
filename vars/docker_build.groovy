def call(String Projectname, String ImageTag, String DockerhubUser){
  sh"docker build -t ${DockerhubUser}/${Projectname}:${ImageTag} ."
}
