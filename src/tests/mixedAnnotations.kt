import org.junit.Ignore
import org.junit.Test
import org.mozilla.fenix.customannotations.SmokeTest

class SmokeTest {
    @Ignore("ignore me 0")
    @Test
    fun verifyBasicNavigationToolbarStuf0() {
        // comments here
    }

    @SmokeTest
    @Test
    fun verifyBasicNavigationToolbarstuffs1() {
        // comments here
    }

    @Ignore("ignore me 2")
    @SmokeTest
    @Test
    fun verifyBasicNavigationToolbarstuffs2() {
        // comments here
    }
    
    @Ignore("ignore me 3")
    @SmokeTest
    fun verifyBasicNavigationToolbarstuffs3() {
        // comments here
    }

    @Test
    fun verifyBasicNavigationToolbarstuffs4() {
        // comments here
    }
}
    