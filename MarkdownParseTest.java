import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import java.util.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void link1() throws IOException {
        Path fileName = Path.of( "test1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link2() throws IOException {
        Path fileName = Path.of( "test2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link3() throws IOException {
        Path fileName = Path.of( "test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-thing.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void link4() throws IOException {
        Path fileName = Path.of( "testFile.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("google", "google translate");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file2() throws IOException {
        Path fileName = Path.of( "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("https://something.com", "some-page.html");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file3() throws IOException {
        Path fileName = Path.of( "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of();
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file4() throws IOException {
        Path fileName = Path.of( "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of();
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file5() throws IOException {
        Path fileName = Path.of( "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("page.com");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file6() throws IOException {
        Path fileName = Path.of( "test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("page.com");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }
/**
    @Test
    public void file7() throws IOException {
        Path fileName = Path.of( "test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("1");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }

    @Test
    public void file8() throws IOException {
        Path fileName = Path.of( "test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List twoLinks = List.of("28");
        assertEquals(twoLinks, links);
	    System.out.println(links);
    }
    */
}