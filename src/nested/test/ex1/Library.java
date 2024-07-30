package nested.test.ex1;

public class Library {
    private final Book[] books;
    private int count;

    public Library(int bookNumber) {
        this.books = new Book[bookNumber];
    }

    public void addBook(String title, String author) {
        if (count < books.length) {
            books[count++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " +
                    books[i].author);
        }
    }

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
