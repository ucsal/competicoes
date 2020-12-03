import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Teste {
	private ByteArrayInputStream inContent;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
		System.setErr(null);
	}

	private String input;
	private String expected;

	public Teste(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}

	@Parameters(name = "{index}: main({0})={1}")
	public static Iterable<Object[]> data() {
		String inputPath = Teste.class.getClassLoader().getResource("input").getPath();
		final File inputFolder = new File(inputPath);
		File[] inputFiles = inputFolder.listFiles();
		String outputPath = Teste.class.getClassLoader().getResource("output").getPath();
		final File outputFolder = new File(outputPath);
		File[] outputFiles = outputFolder.listFiles();
		Object[][] lista = new Object[inputFiles.length][2];

		for (int i = 0; i < lista.length; i++) {
			try {
				lista[i][0] = IOUtils.toString(inputFiles[i].toURI(), "UTF-8");
				lista[i][1] = IOUtils.toString(outputFiles[i].toURI(), "UTF-8");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return Arrays.asList(lista);
	}

	@Test(timeout = 1000)
	public void test() {
		inContent = new ByteArrayInputStream((input).getBytes());
		System.setIn(inContent);
		E.main(null);
		assertEquals(expected, outContent.toString());
	}

}