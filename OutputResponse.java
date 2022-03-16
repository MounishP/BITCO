package march16;

public class OutputResponse {
    int english = 78;

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "OutputResponse{" +
                "english=" + english +
                '}';
    }
}
