using NUnit.Framework;
using AddFunction;

namespace AddFunctionTest
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void Test1()
        {
            Assert.AreEqual(10, Program.Add(5, 5));
        }
    }
}