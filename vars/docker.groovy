def buildAndPush(imageName) {
    def dockerImage = docker.build(imageName)

    withDockerRegistry(credentialsId: 'docker-hub-creds', url: '') {
        dockerImage.push()
    }
}
