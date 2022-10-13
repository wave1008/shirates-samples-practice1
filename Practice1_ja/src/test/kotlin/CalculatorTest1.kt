import org.junit.jupiter.api.Test
import shirates.core.driver.commandextension.select
import shirates.core.driver.commandextension.tap
import shirates.core.driver.commandextension.tapAppIcon
import shirates.core.driver.commandextension.textIs
import shirates.core.testcode.UITest

class CalculatorTest1: UITest() {

    @Test
    fun test1() {

        scenario {
            case(1){
                condition {
                    it.tapAppIcon("電卓")
                        .tap("[AC]")
                }.action {
                    it.tap("[1]")
                        .tap("[2]")
                        .tap("[3]")
                        .tap("[+]")
                        .tap("[4]")
                        .tap("[5]")
                        .tap("[6]")
                        .tap("[=]")
                }.expectation {
                    it.select("[result final]")
                        .textIs("579")
                }
            }
        }
    }
}