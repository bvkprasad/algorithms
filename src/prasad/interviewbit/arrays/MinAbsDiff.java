package prasad.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAbsDiff {
	
	public static void main(String[] args) {
		Integer[] ar = new Integer[] { -3350, -25140, -28453, -22719, -16346, -24782, -24641, -9149, -12899, -9261, -31435, -10958, -7709, -36896, -46423, -38195, -25856, -47706, -32708, -38332, -35188, -35130, -40866, -19039, -37289, -43532, -46953, -4138, -20437, -13777, -5452, -8273, -2903, -44043, -2723, -41192, -30841, -26336, -19114, -1297, -41830, -10942, -16446, -40369, -12911, -41198, -12066, -26955, -30657, -39637, -31075, -5119, -431, -13573, -44710, -37643, -2605, -33736, -5127, -38855, -4986, -23452, -25115, -41588, -3177, -28299, -25356, -5648, -33964, -16909, -32065, -11452, -41173, -42899, -3782, -42178, -18670, -25552, -48149, -40974, -11429, -33031, -7359, -36337, -22663, -26422, -44911, -8786, -3157, -45957, -5975, -25459, -37923, -42152, -49539, -46137, -45227, -24502, -12065, -4558, -13984, -18678, -10075, -42652, -27290, -39891, -22562, -22541, -2636, -5329, -13665, -11838, -23094, -22149, -11427, -31803, -38314, -49574, -49815, -25515, -29857, -44161, -8509, -44146, -11798, -6244, -48154, -13826, -25070, -2888, -37969, -33452, -32341, -48550, -7709, -15048, -29597, -28863, -27014, -13027, -10828, -5657, -22164, -46837, -3436, -42450, -33185, -3061, -34111, -39175, -43103, -8124, -38014, -12987, -25933, -41123, -38100, -8318, -10738, -8327, -46373, -14320, -45741, -26125, -24764, -11084, -19103, -8050, -40127, -7803, -1511, -23689, -5635, -26220, -20205, -42964, -19547, -21318, -4486, -48336, -41945, -18300, -9137, -40045, -40647, -30361, -24421, -25435, -38993, -5722, -19631, -22840, -10632, -34767, -41267, -23339, -39899, -28910, -47056, -39958, -586, -12102, -3098, -33642, -1314, -43544, -3335, -38443, -1754, -16303, -38538, -14976, -21244, -1115, -45802, -41232, -39295, -27600, -9394, -3287, -26573, -16614, -9452, -25361, -44868, -47290, -26794, -29021, -15428, -10647, -9623, -35105, -26923, -18406, -41519, -19141, -36987, -801, -19552, -1732, -15061, -40850, -6795, -49412, -28854, -4549, -14846, -29055, -42324, -37021, -49301, -49877, -19615, -3503, -14317, -41441, -16797, -11522, -21595, -3967, -41697, -6327, -34206, -28492, -21377, -35978, -46746, -19156, -37139, -35104, -10268, -8044, -18077, -27527, -3379, -34604, -26399, -47466, -29724, -16684, -20743, -27046, -36899, -18716, -47816, -44299, -2553, -24455, -37535, -20654, -20111, -47042, -12833, -311, -39147, -7932, -22050, -35552, -24014, -38448, -9617, -42290, -38782, -3355, -9460, -28764, -46972, -14997, -25164, -37328, -30937, -48983, -1510, -24813, -38030, -38459, -43546, -40848, -48921, -13361, -1763, -45912, -37615, -13879, -15372, -41711, -2818, -43685, -39962, -15695, -46346, -38143, -31129, -29231, -6241, -5921, -11848, -5080, -20220, -8966, -18467, -44376, -48877, -25890, -48345, -26281, -27903, -47227, -21098, -14988, -44323, -27966, -15432, -18542, -43358, -23085, -4379, -12308, -20214, -5593, -33608, -6660, -34579, -13815, -20239, -3616, -5111, -45291, -43292, -822, -46648, -8772, -1527, -13289, -4163, -13316, -30039, -43836, -14871, -14434, -43434, -42090, -43030, -1688, -10933, -49296, -31232, -49939, -17072, -31977, -47046, -17730, -21029, -11745, -24901, -11055, -47869, -1255, -10143, -38820, -26198, -7389, -5050, -18012, -28843, -12363, -45495, -41528, -26266, -41403, -1712, -118, -26432, -22098, -47389, -1825, -49793, -35408, -27918, -7591, -23947, -1598, -31328, -529, -29361, -36154, -23876, -28549, -35291, -869, -6839, -5683, -33757, -13972, -31408, -26569, -9060, -20174, -24979, -41037, -20894, -7050, -34407, -1760, -30638, -38083, -30046, -37309, -12852, -5080, -38543, -15770, -17395, -33486, -32476, -426, -31903, -3344, -972, -8656, -39632, -26384, -7417, -18391, -23884, -45782, -8283, -23063, -37351, -49752, -10982, -15987, -32792, -13096, -38419, -38617, -40508, -2278, -43662, -3978, -27957, -49467, -29831, -6977, -37835, -19303, -27892, -6998, -22675, -8897, -18594, -15484, -26868, -36731, -4282, -41801, -10652, -39782, -41728, -44805, -15281, -10246, -38471, -5049, -34145, -13718, -42476, -23539, -31160, -39632, -18126, -17338, -35143, -42151, -763, -20194, -37327, -35483, -7063, -7603, -28478, -11865, -49609, -464, -32324, -3134, -10989, -9629, -23229, -7923, -25688, -15244, -8188, -6103, -46849, -29803, -6262, -30061, -39843, -22307, -22625, -8848, -45277, -32823, -39316, -46133, -40728, -32079, -30701, -36148, -3149, -29517, -8457, -13635, -32378, -5429, -8668, -23914, -40713, -38470, -2308, -37876, -43908, -18923, -40051, -23730, -5301, -30629, -32887, -22840, -37110, -450, -21587, -10933, -1115, -3562, -444, -8309, -25175, -25668, -34178, -33532, -12073, -19570, -41159, -24281, -13287, -3186, -11416, -26774, -22213, -29305, -34053, -31260, -9332, -13926, -25862, -5664, -25641, -40095, -31010, -2455, -40465, -7575, -639, -35239, -5525, -25643, -11242, -41457, -48772, -46582, -41493, -15896, -49119, -11291, -49092, -16426, -26772, -25599, -21923, -8600, -3298, -6517, -21523, -29378, -41014, -31831, -41507, -12248, -12642, -43848, -19176, -26593, -29476, -49193, -15026, -43009, -19488, -20874, -12352, -43714, -46055, -46719, -37520, -2954, -43014, -29544, -10792, -16597, -12852, -29156, -7886, -12758, -41802, -44408, -43617, -26450, -28515, -15161, -31129, -20794, -1889, -29001, -23298, -35334, -18368, -46042, -6893, -38426, -29798, -7050, -45035, -5564, -49590, -15463, -49394, -38788, -17532, -32663, -10378, -34084, -22156, -48054, -21339, -43880, -34037, -31204, -1501, -20343, -33814, -42335, -2005, -12259, -35114, -20022, -19967, -23764, -4806, -30919, -47040, -27150, -21283, -5713, -41352, -4316, -35619, -48384, -35129, -22268, -10576, -42094, -24613, -27294, -8453, -34769, -34152, -20167, -30771, -20579, -2555, -805, -30707, -40119, -6924, -45410, -23040, -2122, -17260, -2078, -6172, -33002, -14157, -12370, -36517, -37419, -1850, -36091, -7218, -3432, -9751, -24976, -30775, -9536, -47467, -7612, -8681, -38138, -11031, -13182, -40692, -20663, -31796, -25198, -31715, -33579, -14052, -18494, -45722, -32145, -23053, -43193, -33343, -49675, -11588, -28347, -23041, -4498, -10755, -35299, -14954, -44649, -8914, -46623, -1571, -21575, -2174, -30760, -10477, -18927, -20013, -25143, -21371, -20555, -10819, -31728, -2485, -33529, -14310, -18416, -40392, -36954, -831, -17846, -1972, -5859, -21565, -11455, -18077, -11325, -38646, -31624, -15034, -23360, -40024, -7966, -42819, -41826, -40800, -25647, -7207, -2915, -30466, -3720, -7736, -4339, -44237, -40179, -13701, -11483, -16246, -7398, -26796, -49324, -12999, -17209, -31270, -835, -46965, -8733, -20746, -22072, -32646, -44509, -14963, -46882, -20862, -31238, -39869, -40568, -31290, -10733, -40493, -21468, -48586, -44329, -28030, -2598, -3608, -40145, -30478, -12110, -28408, -47154, -20038, -31325, -1692, -12995, -30279, -42572, -40552, -23923, -1783, -5983, -44110, -15134, -6695, -34721, -5710, -8054, -163, -11887, -32045, -47886, -30243, -39611, -40394, -29926, -7284, -31425, -48879, -16764, -39273, -3180, -29214, -10560, -30924, -35218, -7085, -5065, -21655, -19545, -21731, -1019, -756, -20131, -43808, -25902, -37293, -12275, -48972, -4841, -47331, -28314, -3968, -33736, -42183, -21608, -42239, -8304, -8284, -18939, -37311, -13949, -12289, -13017, -24332, -30825, -3799, -1835, -23205, -6533, -2949, -10077, -30792, -45312, -10784, -29684, -24607, -7418, -17075, -42034, -6293, -5758, -2771, -32959, -10036, -28534, -42883, -34040, -8790, -6886, -10033, -19298, -19928, -35121, -9379, -5452, -41547, -38157, -41895, -46479, -41239, -16377, -45383, -29151, -20659, -31932, -748, -15667, -41666, -32976, -15279, -42281, -23191, -43108, -4755, -19154, -2352, -22511, -42286, -36377, -48538, -35023, -23723, -14213, -25442, -31438, -17449, -42273, -13135, -33938, -20165, -32297, -30347, -29546, -30131, -12741, -36138, -1894, -25016, -20230, -40111, -534, -43206, -43294, -11172, -15264, -15007, -47594, -46711, -39735, -23740, -9055, -46791, -23784, -46198, -1959, -31691, -27533, -27362, -33172, -45740, -2390, -35632, -31184, -5973, -34564, -22096, -39643, -30665, -45649, -20650, -29406, -20226, -2208, -24882, -31046, -11357, -42090, -12807, -967, -34656, -29465, -11527, -19056, -26174, -3253, -921, -23896, -24578, -34744, -48345, -23203, -27741, -9745, -45227, -22163, -35653, -48641, -31196, -40790, -20554, -24116, -42133, -43378, -40142, -31241, -5209, -28409, -45604, -7857, -26573, -26103, -33044, -45013, -25892, -22979, -44629, -17329, -16446, -28470, -44503, -1845, -9888, -17732, -24129, -40920, -41132, -27277, -32328, -40280, -11133, -46092, -26747, -27241, -33579, -34242, -6011, -26494, -45622, -13853, -5130, -41666, -2960, -13606, -21101, -10098, -25567, -7617, -30908, -26012, -42379, -22742, -20298, -3280, -1157, -44883, -8881, -23677, -13619, -34975, -35151, -39382, -45681, -18748, -4058, -20031, -38451, -41271, -49707, -4429, -7238, -27647, -26638, -35363, -13448, -14992, -14988, -22708, -37810, -18040, -7575, -45204, -2844, -11389, -40668, -14897, -47891, -5492, -34830, -40305, -1399, -11003, -27803, -34856, -22460, -27085, -7925, -26105, -46782, -3676, -43997, -28586, -21518, -15559, -5934, -48968, -48434, -47335, -29857, -46450, -25927, -23159, -1503, -24002, -37457, -23225, -13119, -27175, -26805, -10563, -41037, -26780, -29457, -46793, -44299, -9725, -44221, -3874, -48656, -48739, -29882, -30877, -5235, -16568, -48415, -10062, -49058, -3583, -48825, -35396, -29413, -39414, -44303, -18814, -41874, -9494, -29786, -25210, -10400, -45963, -17502, -6212, -47670, -9441, -34393, -45349, -12299, -13736, -27617, -43166, -33177, -29405, -12568, -10256, -33549, -34527, -22027, -49029, -10894, -11824, -25129, -41269, -12975, -20527, -30932, -18343, -45670, -49054, -23319, -23970, -4435, -30706, -41872, -36121, -38371, -29157, -27270, -44638, -33922, -23463, -39490, -34605, -44281, -43825, -32872, -2431, -40517, -29138, -33762, -31937, -21312, -45733, -14047, -31516, -40039, -23415, -37449, -30660, -40680, -30132, -24934, -4801, -37758, -20185, -40997, -41489, -30133, -2996, -43952, -28478, -4051, -39917, -20646, -35269, -7374, -35507, -39256, -24011, -14363, -47091, -2979, -13571, -48772, -42198, -22566, -31808, -42331, -37752, -46653, -25833, -25992, -7558, -45863, -8195, -32451, -45743, -39555, -48483, -30671, -23401, -32944, -24926, -16151, -23654, -47138, -28985, -44729, -36796, -25337, -17867, -22639, -42066, -35151, -35222, -1458, -45878, -9548, -19061, -23376, -38126, -27539, -38158, -19995, -18328, -30158, -43841, -36578, -32019, -47726, -43192, -33294, -44851, -30739, -42168, -5572, -17380, -29038, -23160, -17224, -27417, -2097, -10889, -2404, -19220, -17515, -43387, -15901, -39619, -4824, -1078, -45555, -390, -27833, -6733, -45875, -33907, -20662, -42148, -8123, -35182, -593, -34074, -49282, -8037, -24656, -41907, -30363, -6063, -46726, -33108, -3599, -30519, -7603, -9257, -37923, -17167, -2229, -45971, -33098, -12374, -15786, -33685, -4663, -5526, -4010, -3543, -4609, -14, -12471, -43254, -36422, -18661, -35053, -1907, -27753, -1531, -3180, -250, -39584, -14535, -24662, -3871, -17202, -46221, -4224, -31197, -25838, -27462, -27025, -5991, -12134, -14627, -21478, -25369, -41976, -30996, -38835, -49025, -35476, -13928, -43904, -23541, -1098, -16382, -4211, -37248, -13045, -10955, -43812, -6102, -29112, -42604, -42668, -19554, -10230, -22655, -13345, -27250, -27865, -1580, -23363, -22775, -31312, -1305, -4185, -29420, -43804, -29601, -46384, -15150, -14037, -39276, -24966, -9650, -18503, -33496, -29296, -15371, -39579, -5651, -38399, -47048, -34957, -37654, -34708, -141, -15491, -14517, -37587, -38034, -10972, -45407, -12086, -663};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(ar));
		MinAbsDiff ob = new MinAbsDiff();
		System.out.println(ob.solve(al));
	}
	
	public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Math.abs(A.get(A.size()-1));
        for(int i = 1; i < A.size(); i++){
            int val = Math.abs(A.get(i) - A.get(i-1));
            if(min > val){
                min = val;
            }
        }
        return min;
    }

}
