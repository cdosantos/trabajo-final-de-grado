echo "Methods,Tests,Mutants,Detected mutants" > all-results.csv

# ./run.sh relative_path class method package

# ./run.sh Angle_getTurn/ Angle "getTurn\(double,double\)" jts
# ./run.sh ArithmeticUtils_subAndCheck/ ArithmeticUtilsNew "subAndCheck\(long,long\)" org.apache.commons.math3.util
# ./run.sh BooleanUtils_compare/ BooleanUtils "compare\(boolean,boolean\)" lang3
# ./run.sh BooleanUtils_toBoolean/ BooleanUtils "toBoolean\(Integer,Integer,Integer\)" lang3
# ./run.sh composite_addChild/ Composite "addChild\(Composite\)" examples
# ./run.sh doublylinkedlistnode_insertRight/ DoublyLinkedListNode "insertRight\(DoublyLinkedListNode\)" examples
# ./run.sh doublylinkedlistnode_remove/ DoublyLinkedListNode "remove\(\)" examples
# ./run.sh Envelope_maxExtent/ Envelope "maxExtent\(\)" jts
# ./run.sh FastMathNew_floor/ FastMathNew "floor\(double\)" org.apache.commons.math3.util
# ./run.sh IntMath_mod/ IntMath mod\(int,int\) "math"
# ./run.sh listcomp02_insert_r/ ListComp02 "insert_r\(R\)" examples
# ./run.sh listcomp02_insert_s/ ListComp02 "insert_s\(S\)" examples
./run.sh map_count/ Map "count\(\)" examples
# ./run.sh map_extend/ Map "extend\(K,V\)" examples
# ./run.sh map_remove/ Map "remove\(K\)" examples
# ./run.sh MathUtil_clamp/ MathUtil "clamp\(int,int,int\)" jts
# ./run.sh MathUtilsNew_copySignInt/ MathUtilsNew "copySignInt\(int,int\)" org.apache.commons.math3.util
# ./run.sh maxbag_add/ MaxBag "add\(Integer\)" examples
# ./run.sh maxbag_getMax/ MaxBag "getMax\(\)" examples
# ./run.sh maxbag_remove/ MaxBag "remove\(Integer\)" examples
# ./run.sh minFinder_findMin/ MinFinder "findMin\(\)" examples
# ./run.sh polyupdate_a1/ Polyupdate "a1\(int\)" examples
# ./run.sh polyupdate_sm/ Polyupdate "sm\(\)" examples
# ./run.sh QueueAr_dequeue/ QueueAr "dequeue\(\)" DataStructures
# ./run.sh QueueAr_dequeueAll/ QueueAr "dequeueAll\(\)" DataStructures
# ./run.sh QueueAr_enqueue/ QueueAr "enqueue\(Object\)" DataStructures
# ./run.sh QueueAr_getFront/ QueueAr "getFront\(\)" DataStructures
# ./run.sh QueueAr_makeEmpty/ QueueAr "makeEmpty\(\)" DataStructures
# ./run.sh ringbuffer_count/ RingBuffer "count\(\)" examples
# ./run.sh ringbuffer_extend/ RingBuffer "extend\(G\)" examples
# ./run.sh ringbuffer_item/ RingBuffer "item\(\)" examples
# ./run.sh ringbuffer_remove/ RingBuffer "remove\(\)" examples
# ./run.sh ringbuffer_wipeOut/ RingBuffer "wipeOut\(\)" examples
# ./run.sh SimpleMethods_abs/ SimpleMethods "abs\(int\)" examples
# ./run.sh SimpleMethods_addElementToSet/ SimpleMethods "addElementToSet\(HashSet\<Integer\>,int\)" examples
# ./run.sh SimpleMethods_getMin/ SimpleMethods getMin\(int,int\) examples
# ./run.sh SimpleMethods_incrementNumberAtIndex/ SimpleMethods "incrementNumberAtIndex\(int\[\],int\)" examples
# ./run.sh StackAr_makeEmpty/ StackAr "makeEmpty\(\)" DataStructures
# ./run.sh StackAr_pop/ StackAr "pop\(\)" DataStructures
# ./run.sh StackAr_push/ StackAr "push\(Object\)" DataStructures
# ./run.sh StackAr_top/ StackAr "top\(\)" DataStructures
# ./run.sh StackAr_topAndPop/ StackAr "topAndPop\(\)" DataStructures
# ./run.sh structure_foo/ Structure "foo\(\)" examples
# ./run.sh structure_setX/ Structure "setX\(int\)" examples