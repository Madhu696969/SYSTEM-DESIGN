package Repository;
import models.*;
import enums.BookStatus;
import java.util.*;

public class BorrowRecordRepository {
	HashMap<Integer,BorrowRecord> borrowRecordRepo;
	public BorrowRecordRepository() {
		this.borrowRecordRepo=new HashMap<>();
	}
	
	public void add(BorrowRecord borRec) {
		borrowRecordRepo.put(borRec.getRecordId(), borRec);
	}
	public BorrowRecord get(int borId) {
		return borrowRecordRepo.getOrDefault(borId, null);
	}
	public void remove(int borId) {
		borrowRecordRepo.remove(borId);
	}
	public boolean contains(int borId) {
		return borrowRecordRepo.containsKey(borId);
	}
	public Collection<BorrowRecord> getAll(){
		return borrowRecordRepo.values();
	}
	public boolean findActiveBorrowByCopy(BookCopy copy) {
        for (BorrowRecord record : borrowRecordRepo.values()) {
            if (record.getBookCopy().getCopyId() == copy.getCopyId()
                    && record.getReturnDate() == null) {
                return true;
            }
        }
        return false;
    }
    public BorrowRecord getActiveBorrowByCopy(BookCopy copy) {
        for (BorrowRecord record : borrowRecordRepo.values()) {
            if (record.getBookCopy().getCopyId() == copy.getCopyId()
                    && record.getReturnDate() == null) {
                return record;
            }
        }
        return null;
    }
    public List<BorrowRecord> getActiveBorrowsByMember(Member member) {
        List<BorrowRecord> records = new ArrayList<>();
        for (BorrowRecord record : borrowRecordRepo.values()) {
            if (record.getMember().getMemberId() == member.getMemberId()
                    && record.getReturnDate() == null) {
                records.add(record);
            }
        }
        return records;
    }
    public List<BorrowRecord> getBorrowHistory(Member member) {
        List<BorrowRecord> records = new ArrayList<>();
        for (BorrowRecord record : borrowRecordRepo.values()) {
            if (record.getMember().getMemberId() == member.getMemberId()) {
                records.add(record);
            }
        }
        return records;
    }	

}
