import com.testapp.Role
import com.testapp.User
import com.testapp.UserRole
class BootStrap {

    def init = { servletContext ->

        def adminRole = new Role(authority: 'ROLE_ADMIN').save()
        def userRole = new Role(authority:  'ROLE_USER').save()

        def testUser = new User(username: 'me', password: 'password', enabled: true).save()

        UserRole.create testUser, adminRole, true

        assert User.count() == 1
        assert Role.count() == 2
        assert UserRole.count() == 1
    }
}