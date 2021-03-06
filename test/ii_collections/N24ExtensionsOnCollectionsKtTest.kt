package ii_collections

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

@Ignore
class N24ExtensionsOnCollectionsKtTest {
    @Test fun testCollectionOfOneElement() {
        doTest(listOf("a"), listOf("a"))
    }

    @Test fun testEmptyCollection() {
        doTest(null, listOf())
    }

    @Test fun testSimpleCollection() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c"))
    }

    @Test fun testCollectionWithEmptyStrings() {
        doTest(listOf("", "", "", ""), listOf("", "", "", "", "a", "bb", "ccc", "dddd"))
    }

    @Test fun testCollectionWithTwoGroupsOfMaximalSize() {
        doTest(listOf("a", "c"), listOf("a", "bb", "c", "dd"))
    }

    private fun doTest(expected: Collection<String>?, argument: Collection<String>) {
        assertEquals("The function 'doSomethingStrangeWithCollection' should do at least something with a collection:",
                expected, doSomethingStrangeWithCollection(argument))
    }
}