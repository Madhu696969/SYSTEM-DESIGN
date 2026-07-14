package Repository;
import java.util.*;
import enums.MemberType;
import models.Member;

public class MemberRepository {
	private final HashMap<Integer,Member> MemberRepo;
	public MemberRepository() {
		this.MemberRepo=new HashMap<>();
	}
	public void add(Member mem) {
		MemberRepo.put(mem.getMemberId(), mem);
	}
	public Member get(int memId) {
		return MemberRepo.getOrDefault(memId, null);
	}
	public void remove(int memId) {
		MemberRepo.remove(memId);
	}
	public boolean contains(int memId) {
		return MemberRepo.containsKey(memId);
	}
	public Collection<Member> getAll(){
		return MemberRepo.values();
	}
	public Member findByEmail(String email) {
		for(Member mem:MemberRepo.values()) {
			if(mem.getEmail().equals(email)) {
				return mem;
			}
		}
		return null;
	}
}
