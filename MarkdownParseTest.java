import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        int one = 1;
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void break1() throws IOException{
        Path fileName = Path.of("breaking-test1.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(),MarkdownParse.getLinks(content));
    }

    @Test
    public void break3() throws IOException{
        Path fileName = Path.of("breaking-test2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"),MarkdownParse.getLinks(content));
    }

    @Test
    public void break2() throws IOException{
        Path fileName = Path.of("breaking-test3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com"),MarkdownParse.getLinks(content));
    }

    @Test
    public void testLinks() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-thing.html"));
    }
    @Test
    public void testLink2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("https://something.com", "some-page.html"));
    }
    @Test
    public void testLink3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of());
    }
    @Test
    public void testLink8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), List.of("a link on the first line"));
    }
    @Test
    public void testLink9() throws IOException{
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
}