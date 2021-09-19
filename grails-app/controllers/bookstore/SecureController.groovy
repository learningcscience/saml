package bookstore


import grails.plugins.springsecurity.Secured

class SecureController {

    @Secured('ROLE_ADMIN')
    def index() {

        render "hello"
    }
}
